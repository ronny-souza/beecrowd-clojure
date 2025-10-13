(require '[clojure.string :as str])

(let [lines (repeatedly 2 read-line)
      parse #(let [[_ quantity price] (str/split % #"\s+")]
               (* (Integer/parseInt quantity) (Double/parseDouble price)))

      total (reduce + (map parse lines))]

  (println (format "VALOR A PAGAR: R$ %.2f" total)))