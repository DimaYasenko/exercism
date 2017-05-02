(ns hamming.core
  (:gen-class))

(defn calculate-distance-between-dna-strands [first-dna second-dna]
  (count (filter #(not= (get % 0) (get % 1)) (map vector first-dna second-dna))))

(defn distance [first-dna second-dna]
  (cond
    (and (empty? first-dna) (empty? second-dna)) 0
    (not= (.length first-dna) (.length second-dna)) nil
    :default (calculate-distance-between-dna-strands first-dna second-dna)))

(defn -main [& args]
  (println "Hamming"))
