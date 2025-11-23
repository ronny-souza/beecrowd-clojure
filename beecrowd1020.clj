(def YEAR-REFERENCE 365)
(def MONTH-REFERENCE 30)

(defn ^:private calculate-years
  [age-in-days]
  (quot age-in-days YEAR-REFERENCE))

(defn ^:private calculate-months
  [age-in-days]
  (quot (rem age-in-days YEAR-REFERENCE) MONTH-REFERENCE))

(defn ^:private calculate-days
  [age-in-days]
  (rem (rem age-in-days YEAR-REFERENCE) MONTH-REFERENCE))

(let [age-in-days (Integer/parseInt (read-line))
      years (calculate-years age-in-days)
      months (calculate-months age-in-days)
      days (calculate-days age-in-days)]
  (println (str years " ano(s)"))
  (println (str months " mes(es)"))
  (println (str days " dia(s)")))