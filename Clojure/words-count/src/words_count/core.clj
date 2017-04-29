(ns words-count.core
  (:gen-class))

(defn word-count [phrase]
  (into {} (map #(vector (get % 0) (count (get % 1)))
                (group-by identity (re-seq #"[A-Za-z0-9]+" (.toLowerCase phrase))))))

(defn -main [& args]
  (println "Words count"))
