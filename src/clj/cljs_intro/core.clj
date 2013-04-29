(ns cljs-intro.core
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [noir.response :as response]
            [cljs-intro.db :as db]))

(defroutes app-routes
  (GET "/player/:lastname" [lastname]       
       (response/json (merge {:name lastname} (db/get-player lastname))))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
