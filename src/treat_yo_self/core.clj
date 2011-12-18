(ns treat-yo-self.core)

(use 'overtone.live)

(require '[overtone.inst.drum :as drum])

(defn mytom [] (drum/tom 2))


(mytom)
(now)
(apply-at (+ (now) 1000) mytom)
()

(definst back-beat []
  (* 0.2
     (+ (sin-osc 100) (saw 200) (saw 203) (sin-osc 40)
        (sin-osc 101) (saw 202) (saw 205) (sin-osc 41))))

((definst trancy-waves []
   (* 0.2
      (+ (sin-osc 100) (saw 200) (saw 203) (sin-osc 40)
         (sin-osc 101) (saw 202) (saw 205) (sin-osc 41)
         ))))
(stop)


