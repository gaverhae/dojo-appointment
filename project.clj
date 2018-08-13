(defproject dojo-appointment "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/data.xml "0.0.8"]
                 [liberator "0.15.2"]
                 [metosin/compojure-api "1.1.12"]
                 [http-kit "2.3.0"]
                 [ring/ring-core "1.6.3"]]
  :ring {:handler dojo-appointment.core/handler}
  :plugins [[lein-ring "0.12.4"]])
