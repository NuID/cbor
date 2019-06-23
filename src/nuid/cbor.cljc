(ns nuid.cbor
  (:require
   #?@(:clj [[clj-cbor.tags.clojure :as cbor.tags.clj]])))

(defmulti tagged-literal-read-handler-multimethod :tag)

(defmethod tagged-literal-read-handler-multimethod :default
  [tagged]
  tagged)

(defn register-tagged-literal-read-handler!
  [{:keys [tag f]}]
  (defmethod tagged-literal-read-handler-multimethod tag
    [tagged]
    (f (:form tagged))))

#?(:clj
   (def tagged-literal-read-handler
     {cbor.tags.clj/generic-object-tag
      (comp tagged-literal-read-handler-multimethod
            cbor.tags.clj/parse-tagged-literal)}))
