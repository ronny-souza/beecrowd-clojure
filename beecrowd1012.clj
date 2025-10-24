(require '[clojure.string :as str])
(def PI 3.14159)

(let [line (read-line)
      values (str/split line #"\s+")
      [a b c] (map #(Double/parseDouble %) values)

      triangle (/ (* a c) 2)
      circle (* PI c c)
      trapezium (/ (* (+ a b) c) 2)
      square (* b b)
      rectangle (* a b)]

  (println (format "TRIANGULO: %.3f" triangle))
  (println (format "CIRCULO: %.3f" circle))
  (println (format "TRAPEZIO: %.3f" trapezium))
  (println (format "QUADRADO: %.3f" square))
  (println (format "RETANGULO: %.3f" rectangle)))