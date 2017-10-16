(ns learn-functions.functions
    (:gen-class))


;; apply - use with vectors
(apply max [1 2 3])

(map #(apply max %) [[1 2 3][4 5 6][7 8 9]])

