(ns lanterna.constants
  (:import java.nio.charset.Charset
           com.googlecode.lanterna.TerminalFacade
           com.googlecode.lanterna.screen.Screen
           com.googlecode.lanterna.terminal.Terminal
           com.googlecode.lanterna.terminal.swing.TerminalPalette
           com.googlecode.lanterna.input.KeyType))


(def charsets {:utf-8 (Charset/forName "UTF-8")})

(def colors
  {:black   com.googlecode.lanterna.terminal.Terminal$ANSIColor/BLACK
   :white   com.googlecode.lanterna.terminal.Terminal$ANSIColor/WHITE
   :red     com.googlecode.lanterna.terminal.Terminal$ANSIColor/RED
   :green   com.googlecode.lanterna.terminal.Terminal$ANSIColor/GREEN
   :blue    com.googlecode.lanterna.terminal.Terminal$ANSIColor/BLUE
   :cyan    com.googlecode.lanterna.terminal.Terminal$ANSIColor/CYAN
   :magenta com.googlecode.lanterna.terminal.Terminal$ANSIColor/MAGENTA
   :yellow  com.googlecode.lanterna.terminal.Terminal$ANSIColor/YELLOW
   :default com.googlecode.lanterna.terminal.Terminal$ANSIColor/DEFAULT})

(def styles
  {:bold com.googlecode.lanterna.terminal.Terminal$SGR/BOLD
   :reverse com.googlecode.lanterna.terminal.Terminal$SGR/REVERSE
   :underline com.googlecode.lanterna.terminal.Terminal$SGR/UNDERLINE
   :blinking com.googlecode.lanterna.terminal.Terminal$SGR/BLINK})

(def key-codes
  {com.googlecode.lanterna.input.KeyType/Character :normal
   com.googlecode.lanterna.input.KeyType/Escape :escape
   com.googlecode.lanterna.input.KeyType/Backspace :backspace
   com.googlecode.lanterna.input.KeyType/ArrowLeft :left
   com.googlecode.lanterna.input.KeyType/ArrowRight :right
   com.googlecode.lanterna.input.KeyType/ArrowUp :up
   com.googlecode.lanterna.input.KeyType/ArrowDown :down
   com.googlecode.lanterna.input.KeyType/Insert :insert
   com.googlecode.lanterna.input.KeyType/Delete :delete
   com.googlecode.lanterna.input.KeyType/Home :home
   com.googlecode.lanterna.input.KeyType/End :end
   com.googlecode.lanterna.input.KeyType/PageUp :page-up
   com.googlecode.lanterna.input.KeyType/PageDown :page-down
   com.googlecode.lanterna.input.KeyType/Tab :tab
   com.googlecode.lanterna.input.KeyType/ReverseTab :reverse-tab
   com.googlecode.lanterna.input.KeyType/Enter :enter
   com.googlecode.lanterna.input.KeyType/Unknown :unknown
   com.googlecode.lanterna.input.KeyType/CursorLocation :cursor-location})


(def palettes
  {:gnome      TerminalPalette/GNOME_TERMINAL
   :vga        TerminalPalette/STANDARD_VGA
   :windows-xp TerminalPalette/WINDOWS_XP_COMMAND_PROMPT
   :mac-os-x   TerminalPalette/MAC_OS_X_TERMINAL_APP
   :xterm      TerminalPalette/PUTTY
   :putty      TerminalPalette/XTERM})

(def enter-styles
  {:bold com.googlecode.lanterna.terminal.Terminal$SGR/BOLD
   :reverse com.googlecode.lanterna.terminal.Terminal$SGR/REVERSE
   :blinking com.googlecode.lanterna.terminal.Terminal$SGR/BLINK
   :underline com.googlecode.lanterna.terminal.Terminal$SGR/UNDERLINE})

;; (def exit-styles
;;   {:bold com.googlecode.lanterna.terminal.Terminal$SGR/EXIT_BOLD
;;    :reverse com.googlecode.lanterna.terminal.Terminal$SGR/EXIT_REVERSE
;;    :blinking com.googlecode.lanterna.terminal.Terminal$SGR/EXIT_BLINK
;;    :underline com.googlecode.lanterna.terminal.Terminal$SGR/EXIT_UNDERLINE})

;; (def reset-style
;;   com.googlecode.lanterna.terminal.Terminal$SGR/RESET_ALL)
