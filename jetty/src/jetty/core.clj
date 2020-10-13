(ns jetty.core
  (:gen-class)
  (:require
   [ring.adapter.jetty :as jetty]
   )
  (:import
   java.lang.Runtime
   ))


(defn handler
  [_]
  {:status  200
   :headers {}
   :body    "Hello, World!"})


(defn -main
  [& _xs]
  (try
    (let [server (jetty/run-jetty handler {:port 8080 :join? false})
          host   (.. server getURI getHost)
          port   (.. server getURI getPort)]
      (. (Runtime/getRuntime) (addShutdownHook (Thread. (fn [] (println "Shutting down...") (.stop server)))))
      (println (str "jetty server started on: http://" host ":" port)))
    (catch Throwable e
      (.printStackTrace e)
      (shutdown-agents))))
