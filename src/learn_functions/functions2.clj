(ns learn-functions.functions2
  (:require [clojure.test :refer :all]))

;; reduce
(reduce + [1 2 3 4 5])

(reduce * '(1 2 3 4))

;; vector to a set
(reduce conj #{} [:a :b :c])
;same as
(into #{} [:a :b :c])

(reduce conj [1 2 3] [4 5 6])

;; return largest value
(reduce (fn [a b]
            (if (> a b)
              a
              b))
              0
        [1 2 3 4 5])

;; general format
;(reduce (fn [left right]
;            (dosomething left right))
;        starting-value
;        collection)