(ns koans.sandbox
  (:require [koan-engine.core :refer :all]))


(filter (fn [x] (< 30 x))[10 20 30 40 50 60 70 80])

(reduce (fn [a b] (+ a b))[1 2 3 4])

(count "hola")

(list "Rich" "Hickey" "The Clojurer" "Go Time" "Lambda Guru")

(def id-test
  {:id "123456"
   :nat "ARG"
   :city "London"})

(defn myfunc [[first-name last-name] {:keys [id nat city]}] 
  (str first-name " " last-name "," id))
  
(myfunc ["gonzalo" "gomez"] id-test)

(iterate (fn [x] (x)) "algo")
(repeat "Algo" )
(take 5 (iterate identity "something"))

(def dalmatian-list ["Pongo" "Perdita" "Puppy" "Pepe"])
(let [[dalma1 dalma2 & dalmatians] dalmatian-list] [dalma1 dalma2 dalmatians])

