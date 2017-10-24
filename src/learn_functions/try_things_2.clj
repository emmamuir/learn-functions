(ns learn-functions.try-things-2)

(def person {:name "Emma" :age 21 :address {:number 15 :line1 "Hollow Avenue" :line2 "Renfrew" :town "Paisley"}})

(let [{name :name age :age {number :number} :address} person]
  (prn number))