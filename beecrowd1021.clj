(def BILLS [100.0 50.0 20.0 10.0 5.0 2.0])
(def COINS [1.0 0.50 0.25 0.10 0.05 0.01])

(defn ^:private calculate-bills-and-print
  [value]
  (println "NOTAS:")
  (loop [n value notes BILLS]
    (if (empty? notes)
      n
      (when (seq notes)
            (let [note (first notes)
                  adjusted-note (* note 100)
                  count (quot n adjusted-note)
                  remainder (rem n adjusted-note)]
              (println (format "%.0f nota(s) de R$ %.2f" count note))
              (recur remainder (rest notes)))))))

(defn ^:private calculate-coins-and-print
  [value]
  (println "MOEDAS:")
  (loop [n value coins COINS]
    (when (seq coins)
      (let [coin (first coins)
            adjusted-coin (* coin 100)
            count (quot n adjusted-coin)
            remainder (rem n adjusted-coin)]
        (println (format "%.0f moeda(s) de R$ %.2f" count coin))
        (recur remainder (rest coins))))))

(let [value (Double/parseDouble (read-line))
      adjusted-value (+ (* value 100) 0.05)
      value-after-notes-calc (calculate-bills-and-print adjusted-value)]
  (calculate-coins-and-print value-after-notes-calc))