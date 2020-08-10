(ns json2edn.core
  "Original source code: https://gist.github.com/taylorwood/23d370f70b8b09dbf6d31cd4f27d31ff"
  (:require
   [clojure.data.json :as json]
   )
  (:gen-class))


(defn -main
  [& args]
  (if (string? (first args))
    (prn (json/read-str (slurp (first args)) :key-fn keyword))
    (prn (json/read *in* :key-fn keyword))))
