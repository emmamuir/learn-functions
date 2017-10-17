(ns learn-functions.functions
    (:gen-class))


;; apply - use with vectors
(apply max [1 2 3])

(map #(apply max %) [[1 2 3][4 5 6][7 8 9]])

;; if condition
(def status "help")

;; checking for null value
(if (nil? status)
  (prn "your status is nil")
  (prn (str "your status is not nil")))

;; you can remove nil?
(if status
  (prn (str "your status is " status))
  (prn "you do not have any status"))

(def age 5)
(if (< age 8)
  (prn "you are younger than me")
  (prn "you are older than me"))