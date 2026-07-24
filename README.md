# ElementalsMoreBendings Addon - Multi-Loader (Minecraft 1.21.1)

Este projeto usa uma arquitetura **Multi-Loader** com suporte a **Fabric** e **NeoForge**.

## Estrutura do Projeto:
- **`common/`**: Contém todo o código-fonte das sub-dobras (`Gas`, `Plant`, `Mud`, `Crystal`), recursos de idioma (`pt_br`, `en_us`) e lógica compartilhada.
- **`fabric/`**: Módulo e entrypoint exclusivo do Fabric (`ElementalsMoreBendingsFabric`).
- **`neoforge/`**: Módulo e entrypoint exclusivo do NeoForge (`ElementalsMoreBendingsNeoForge`).

## Como abrir no IntelliJ IDEA:
1. Abra o **IntelliJ IDEA**.
2. Clique em **Open** e selecione a pasta `ElementalsMoreBendings-v2`.
3. Aguarde o Gradle importar os módulos `common`, `fabric` e `neoforge`.
4. Para rodar o Fabric: Execute a task do Gradle `fabric -> runClient`.
5. Para rodar o NeoForge: Execute a task do Gradle `neoforge -> runClient`.
