(def TIME-REFERENCE 60)

(defn ^:private calculate-time-division
  [value]
  (quot value TIME-REFERENCE))

(defn ^:private calculate-time-rest
  [value]
  (rem value TIME-REFERENCE))

(let [duration-in-seconds (Integer/parseInt (read-line))
      seconds (calculate-time-rest duration-in-seconds)
      minutes (calculate-time-division duration-in-seconds)
      hours (calculate-time-division minutes)
      minutes-after-hours (calculate-time-rest minutes)]
  (println (str hours ":" minutes-after-hours ":" seconds)))