(require '[clojure.string :as str])

(let [[n1 n2 n3 n4] (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))
      average (/ (int (+ (* 2 n1) (* 3 n2) (* 4 n3) (* 1 n4))) 10.0)]
  (println (format "Media: %.1f" average))
  (cond
    (>= average 7.0)
    (println "Aluno aprovado.")

    (< average 5.0)
    (println "Aluno reprovado.")

    :else
    (do
      (println "Aluno em exame.")
      (let [recovery-note (Double/parseDouble (read-line))
            new-average (/ (+ average recovery-note) 2)]
        (println (format "Nota do exame: %.1f" recovery-note))
        (if (>= new-average 5.0)
          (println "Aluno aprovado.")
          (println "Aluno reprovado."))
        (println (format "Media final: %.1f" new-average))))))