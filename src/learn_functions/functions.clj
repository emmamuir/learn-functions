(ns learn-functions.functions
    (:gen-class))


;; apply - use with vectors - treats vector as one
(apply max [1 2 3])

;; map - use to apply max across several vectors
(map #(apply max %) [[1 2 3] [4 5 6] [7 8 9]])

;; define a variable
(def status "help")

;; checking for null value
(defn check-null [status]
      (if (nil? status)
        (prn "your status is nil")
        (prn "your status is not nil")))

;; you can remove 'nil?'
;; use 'str' for concatenation
(defn check-null-2 [status]
      (if status
        (prn (str "your status is " status))
        (prn "you do not have any status")))


(def age 5)

(defn check-age [age]
      (if (< age 8)
        (prn "you are younger than me")
        (prn "you are older than me")))

;; recur (for loop)
(loop [i 0]
      (when (< i 5)
            (println i)
            (recur (inc i))                                 ; loop i will take this value
            ))

(loop [i 0]
      (when (< i 5)
            (prn (str "number is " i))
            (recur (inc i))))










































