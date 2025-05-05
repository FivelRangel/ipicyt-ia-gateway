# Proyecto de Desarrollo de Ecosistema de IA para Sensores de IPICYT.

Este proyecto, consiste en un desarrollo para el Diplomado de Ciencia y Tecnología en Inteligencia Artificial del IPICYT.

# Railway:
https://railway.com/project/b0a02c62-e422-4e1e-b340-f91df3001a9a?environmentId=ba03676a-aa57-425d-8d88-781dbdc4b8b3

#Endpoints:
1-

GET:
https://ipicyt-ia-gateway-production.up.railway.app/mediciones

POST:
{
  "valor": "998.45"
}

Index:
https://ipicyt-ia-gateway-production.up.railway.app/mediciones/hello


2.-
POST
https://ipicyt-ia-gateway-production.up.railway.app/sensores


GET: Obtiene los últimos sensores registrados.
https://ipicyt-ia-gateway-production.up.railway.app/sensores

Ontener TODOS los valores almacenados:
GET: https://ipicyt-ia-gateway-production.up.railway.app/todos


Valores en crudo que envía el sensor:
Objeto del sensor 1 con error:

{
  "time": "2025-04-21T04:45:18.015654971+00:00",
  "deviceInfo": {
    "tenantId": "52f14cd4-c6f1-4fbd-8f87-4025e1d49242",
    "tenantName": "IPICyT",
    "applicationId": "11744b65-5428-4ad2-b6df-03b13e547296",
    "applicationName": "Co_2",
    "deviceProfileId": "38607b09-4782-4b75-99d1-998b564ed43d",
    "deviceProfileName": "Co_2",
    "deviceName": "Sensor_1",
    "devEui": "2cf7f1c16100001a",
    "deviceClassEnabled": "CLASS_C",
    "tags": {}
  },
  "level": "ERROR",
  "code": "UPLINK_CODEC",
  "description": "JS error: Error: decodeUplink is not defined\n    at <eval> (eval_script:42:1)\n",
  "context": {
    "deduplication_id": "12f6d36d-7860-4dca-bcf0-297ad1a6db39"
  }
}

Onjeto del sensor 2 sin error (de decodificación):
{
  "deduplicationId": "12f6d36d-7860-4dca-bcf0-297ad1a6db39",
  "time": "2025-04-21T04:45:18.005217982+00:00",
  "deviceInfo": {
    "tenantId": "52f14cd4-c6f1-4fbd-8f87-4025e1d49242",
    "tenantName": "IPICyT",
    "applicationId": "11744b65-5428-4ad2-b6df-03b13e547296",
    "applicationName": "Co_2",
    "deviceProfileId": "38607b09-4782-4b75-99d1-998b564ed43d",
    "deviceProfileName": "Co_2",
    "deviceName": "Sensor_1",
    "devEui": "2cf7f1c16100001a",
    "deviceClassEnabled": "CLASS_C",
    "tags": {}
  },
  "devAddr": "26011a00",
  "adr": true,
  "dr": 0,
  "fCnt": 1175,
  "fPort": 8,
  "confirmed": true,
  "data": "AQN/qkM=",
  "rxInfo": [
    {
      "gatewayId": "2cf7f11154600043",
      "uplinkId": 36879,
      "nsTime": "2025-04-21T04:45:17.786811151+00:00",
      "rssi": -96,
      "snr": -17.0,
      "channel": 6,
      "rfChain": 1,
      "location": {},
      "context": "DoFcoQ==",
      "crcStatus": "CRC_OK"
    }
  ],
  "txInfo": {
    "frequency": 905100000,
    "modulation": {
      "lora": {
        "bandwidth": 125000,
        "spreadingFactor": 10,
        "codeRate": "CR_4_5"
      }
    }
  },
  "regionConfigId": "us915_0"
}


*FRONTEND-APP*

Deploy
https://railway.com/project/63957b3a-87e9-4518-900a-969b4fc32121/service/5bbb9039-3410-4f21-bfa6-0e238f4af60f?environmentId=33ea72ed-01cb-4d2b-87a2-362584cdd8b5

Github
https://github.com/FivelRangel/IPICYT-DASHBOARD-REACT-PLUS

DASHBOARD:
https://ipicyt-dashboard-react-plus-production.up.railway.app/


