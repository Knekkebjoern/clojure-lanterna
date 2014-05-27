(ns lanterna.test.screen
  (:require [lanterna.screen :as screen])
  (:use [clojure.test]))

(deftest get-screen
  (let [screen (screen/get-screen)]
    (is (instance? com.googlecode.lanterna.screen.Screen screen)))
  (let [screen (screen/get-screen {:charset :utf-8})]
    (is (instance? com.googlecode.lanterna.screen.Screen screen))))

;; Put a string in the screen, and verify that each character is in the
;; 'back' buffer.
(deftest put-string
  (let [screen (screen/get-screen {:charset :utf-8})
        test-string "test string"]
    (screen/put-string screen 0 0 test-string)
    (loop [s test-string i 0]
      (if (empty? s)
        nil
        (do
          (is (.equals (.getBackCharacter screen (new com.googlecode.lanterna.terminal.TerminalPosition i 0))
                       (new com.googlecode.lanterna.common.TextCharacter (first s))))
          (recur (rest s) (inc i)))))))
