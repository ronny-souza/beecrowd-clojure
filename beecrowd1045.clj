(require '[clojure.string :as str])

(let [values (map #(Double/parseDouble %) (str/split (read-line) #"\s+"))
      sorted-values (sort values)
      a (nth sorted-values 2)
      b (nth sorted-values 1)
      c (nth sorted-values 0)]
  (if (>= a (+ b c))
    (println "NAO FORMA TRIANGULO")
    (let [first-condition (* a a)
          second-condition (+ (* b b) (* c c))]

        (if (= first-condition second-condition) (println "TRIANGULO RETANGULO"))
        (if (> first-condition second-condition) (println "TRIANGULO OBTUSANGULO"))
        (if (< first-condition second-condition) (println "TRIANGULO ACUTANGULO"))
        (if (and (= a b) (= b c)) (println "TRIANGULO EQUILATERO"))
        (if (or (and (= a b) (not (= a c))) (and (= a c) (not (= a b))) (and (= b c) (not (= b a)))) (println "TRIANGULO ISOSCELES")))))