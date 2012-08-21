(ns euler_clojure.views.problems
  (:require [euler_clojure.views.common :as common]
    [euler_clojure.problems.1])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/problems" [] 
  (common/layout [:p "Problem 1"]))

(defpage "/problems/:id" {:keys [id]}
  (let [prob (str "euler_clojure.problems." id)]
    (common/layout [:p (str "Problem " id)]
      [:p (load-string (str prob "/description"))]
      [:p (load-string (str "(" prob "/answer)"))])))