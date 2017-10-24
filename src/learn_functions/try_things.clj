(ns learn-functions.try-things)


(def someHomeCategory :uk)
(def customer-with-home-category {
                                  :application {
                                                :addresses {
                                                            :home someHomeCategory}}})

(let [{{{home :home} :addresses} :application} customer-with-home-category]
     (if (= home :uk)
          (prn "your address is in UK")
          (prn "your address is not in UK"))
     (println home))




; destructuring
(def client {:name "Super Co."
             :location "Philadelphia"
             :description "The worldwide leader in plastic tableware."})

(let [{name :name
       location :location
       description :description} client]
     (println name location "-" description))


; nested destructuring
(def my-nested-hashmap {:a "A" :b "B" :c "C" :d "D" :q {:x "X" :y "Y" :z "Z"}})

(let [{a :a, b :b, {x :x, y :y} :q} my-nested-hashmap]
     (println a b x y))