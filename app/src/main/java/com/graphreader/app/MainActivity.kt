package com.graphreader.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    Column(
                        Modifier.padding(24.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text("Graph Reader", style = MaterialTheme.typography.headlineMedium)
                        Text("Base inicial do aplicativo de análise contínua de gráficos.")

                        Button(onClick = {
                            startActivity(
                                Intent(
                                    Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                                    Uri.parse("package:$packageName")
                                )
                            )
                        }) {
                            Text("Permitir painel flutuante")
                        }

                        Text("Próxima etapa: captura de tela, monitoramento contínuo e identificação de padrões.")
                    }
                }
            }
        }
    }
}
