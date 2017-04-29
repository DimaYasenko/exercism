(ns bob.core
  (:require [clojure.string :as string])
  (:gen-class))

(defn silence? [phrase]
  (empty? (.trim phrase)))

(defn shouting? [phrase]
  (and (contains-letter? phrase)
       (not (silence? phrase))
       (= (.toUpperCase phrase) phrase)))

(defn question? [phrase]
  (.endsWith phrase "?"))

(defn contains-letter? [phrase]
  (some #(Character/isLetter %) phrase))

(defn response-for [phrase]
  (cond
    (silence? phrase)  "Fine. Be that way!"
    (shouting? phrase) "Whoa, chill out!"
    (question? phrase) "Sure."
    :default           "Whatever."))

(defn -main [& args]
  (println "Bob"))
