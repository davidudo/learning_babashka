#!/usr/bin/env bb

(require '[clojure.string :as str])

(str/join " " ["Hello" "inner" "world!"])
(str "Hello from " *ns* ", inner world!")

(println "Hello, inner world!")
nil
