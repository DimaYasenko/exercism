(ns hello-world.core
  (:gen-class))

(defn hello
  ([] "Hello, World!")
  ([name] (str "Hello, " name "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
