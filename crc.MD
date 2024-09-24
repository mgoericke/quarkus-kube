Download CRC und Pullsecret 

Einrichtung starten:
```shell
crc setup

# Pullsecret wird während des Startvorgangs verlangt
crc start 

# Hinzufügen des 'oc' Kommandos zur PATH Variable
crc oc-env
```

Bei der Installation werden zwei Benutzer angelegt:

* kubadmin (administrativer Benutzer)
* developer (einfacher Benutzer)

Die Zugangsdaten für diese Benutzer können mit dem folgenden Kommando ausgegeben werden:

```shell
crc console --credentials
```

# Zugriff auf interne Registry

## Docker Zugriff auf insecure-registries erlauben

Diese Konfiguration kann entweder im Docker Desktop (Docker Desktop > Einstellungen > Docker Engine)

```json
"insecure-registries": [
  "default-route-openshift-image-registry.apps-crc.testing"
]
```
## Login an der internen Registry

```shell
oc whoami -t |docker login -u developer --password-stdin "default-route-openshift-image-registry.apps-crc.testing"
```