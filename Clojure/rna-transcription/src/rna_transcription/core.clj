(ns rna-transcription.core
  (:gen-class))

(defn validate-dna [dna]
  (if (empty? dna)
    false
    (every? #(or (= \G  %) (= \C %) (= \T %) (= \A %)) dna)))

(defn to-rna [dna]
  (if-not (validate-dna dna)
    (throw (new AssertionError "Not valid DNA"))
    (apply str (map #(cond
                       (= \G %) \C
                       (= \C %) \G
                       (= \T %) \A
                       (= \A %) \U)
                    dna))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "RNA-transcription"))
