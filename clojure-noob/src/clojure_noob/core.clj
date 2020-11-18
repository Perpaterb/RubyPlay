(ns clojure-noob.core
  (:gen-class))

  (def prenumber (rand-int 9))
  (def number (+ prenumber 1))
  (def ^:dynamic intinput 42)

(defn -main
  [& args]

  (println number)

  (let [input (read-line)]
    (let [intinput (int input)])
    (if (= intinput number)
      (println "Correct")
      (println "Wrong")))

  (println intinput)
)
  


