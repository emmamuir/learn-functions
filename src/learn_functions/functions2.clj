(ns learn-functions.functions2
  (:require [clojure.test :refer :all]))

;; reduce
(reduce + [1 2 3 4 5])

;; vector to a set
(reduce conj #{} [:a :b :c])

(reduce conj [1 2 3] [4 5 6])

(reduce * '(1 2 3 4))

(reduce +  [1 2 3 4])