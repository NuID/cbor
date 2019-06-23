# nuid.cbor

Cross-platform [`CBOR`](https://cbor.io/) encoding facilities.

## Requirements

[`jvm`](https://www.java.com/en/download/), [`node + npm`](https://nodejs.org/en/download/), [`clj`](https://clojure.org/guides/getting_started), [`shadow-cljs`](https://shadow-cljs.github.io/docs/UsersGuide.html#_installation)

## From Clojure and ClojureScript

## Notes

Currently this library only adds convenience fns over [`clj-cbor`](https://github.com/greglook/clj-cbor), and only the JVM is supported.

### tools.deps:

`{nuid/cbor {:git/url "https://github.com/nuid/cbor" :sha "..."}}`

## Licensing

Apache v2.0 or MIT

## Contributing

Install [`git-hooks`](https://github.com/icefox/git-hooks) and fire away.

### formatting:

```
$ clojure -A:cljfmt            # check
$ clojure -A:cljfmt:cljfmt/fix # fix
```

### dependencies:

```
## check
$ npm outdated 
$ clojure -A:depot

## update
$ npm upgrade -s
$ clojure -A:depot:depot/update
```
