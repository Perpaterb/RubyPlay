(ns clojure-noob.core
  (:gen-class))
 
(defn -main
  [& args]

  (defn read-guess []
    (let [guess (read)]
      guess))
  
  (defn print-greeting []
    (println (str "A random number from 1 to 10 has been generated"))
    (println (str "Type in a guess: "))
    )
  
  (defn guessed-wrong [direction]
    (println (str direction))
    false)
  
  (defn guessed-right []
    (println (str "You got it!"))
    true)
  
  (defn evaluate [answer guess]
      (cond
            (> answer guess) (guessed-wrong "Higher")
            (< answer guess) (guessed-wrong "Lower")
            :else (guessed-right)))
  
  (print-greeting)
  (let [answer (inc (rand-int 10))]
    (loop []
      (if (= true (evaluate answer(read-guess)))
      -1
      (recur))))
)