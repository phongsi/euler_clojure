(ns euler_clojure.views.welcome
  (:require [euler_clojure.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to euler_clojure"]))
