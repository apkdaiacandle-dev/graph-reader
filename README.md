# Graph Reader

Projeto Android inicial para o Graph Reader.

## O que já existe
- Kotlin + Jetpack Compose
- Android 10+
- Permissão de sobreposição
- Estrutura para Foreground Service
- Manifesto preparado para MediaProjection

## Próximas etapas
1. Implementar autorização MediaProjection.
2. Capturar a tela continuamente.
3. Selecionar/detectar a área do gráfico.
4. Criar o painel flutuante.
5. Implementar análise de candles e padrões.
6. Adicionar histórico e alertas.

## Compilar
No ambiente Android/Gradle:
`./gradlew assembleDebug`

O APK será gerado em:
`app/build/outputs/apk/debug/app-debug.apk`
