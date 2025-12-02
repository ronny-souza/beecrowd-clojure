(require '[clojure.string :as str])

(defn calculate-game-duration
  [start-time end-time]
  (cond
    (= start-time end-time) 24
    (< start-time end-time) (- end-time start-time)
    :else (- (+ 24 end-time) start-time)))

(let [[start-time end-time] (map #(Integer/parseInt %) (str/split (read-line) #"\s+"))
      duration (calculate-game-duration start-time end-time)]
  (println "O JOGO DUROU" duration "HORA(S)"))