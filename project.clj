(defproject cljs-intro "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [sqlitejdbc "0.5.6"]
                 [domina "1.0.0"]
                 [hiccups "0.1.1"]               
                 [compojure "1.1.5"]
                 [lib-noir "0.3.5"]]
  :ring {:handler cljs-intro.core/app}
  :plugins [[lein-cljsbuild "0.2.7"] [lein-ring "0.8.2"]]
  :source-paths ["src/clj"]
  :cljsbuild {:builds [{:source-path "src/cljs"
                        :compiler {:output-to "resources/public/hockey.js"
                                   :optimization :whitespace
                                   :pretty-print true}}]}
  :profiles {:dev {:dependencies [[ring-mock "0.1.3"]]}})
