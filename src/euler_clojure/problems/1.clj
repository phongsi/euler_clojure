(ns euler_clojure.problems.1)

(def description 
  (str "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000."))

(defn mod3or5? [x]
  (or
    (zero? 
      (mod x 3))
    (zero?
      (mod x 5))))

(defn answer []
  (let [nums (range 3 1000 1)]
    (apply + 
      (filter mod3or5? nums))))