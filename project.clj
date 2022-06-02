(defproject clojure-aws-get-started "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/data.json "0.2.6"]
                 [clj-time "0.15.1"]
                 [com.amazonaws/aws-lambda-java-core "1.2.0"]
                 [com.amazonaws/aws-lambda-java-events "2.2.5"]]
  :uberjar-name "clojure-aws-get-started.jar"
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})