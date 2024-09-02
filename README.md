# GameruleBlocker
1.21 paper plugin to prevent staff from accidentally running the vanilla `/gamerule` instead of `/mv gamerule` (or an equivalent).

---
### config.yml

> [!TIP]
> This config uses MiniMessage formatting, for more information go [here](https://docs.advntr.dev/minimessage/format.html).
```yml
# this is the message that displays to staff when they run /gamerule.
messages: "<red>When setting a gamerule you should be using <u>/mv gamerule</u>. If you meant to use the vanilla gamerule command use <u>/minecraft:gamerule</u>"
```