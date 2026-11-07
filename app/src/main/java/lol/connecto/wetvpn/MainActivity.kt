package lol.connecto.wetvpn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Black = Color(0xFF090909)
private val Panel = Color(0xFF171717)
private val Yellow = Color(0xFFFFD400)
private val Muted = Color(0xFF9A9A9A)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                WetVpnScreen()
            }
        }
    }
}

@Composable
private fun WetVpnScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Black
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("WET", color = Yellow, fontSize = 30.sp, fontWeight = FontWeight.Black)
                Text("VPN", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(54.dp))

            Text("ВАШЕ СОЕДИНЕНИЕ", color = Muted, fontSize = 12.sp, letterSpacing = 2.sp)
            Spacer(Modifier.height(12.dp))
            Text("НЕ ПОДКЛЮЧЕНО", color = Color.White, fontSize = 23.sp, fontWeight = FontWeight.Bold)

            Spacer(Modifier.height(28.dp))

            Surface(
                color = Panel,
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(22.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("●", color = Yellow, fontSize = 44.sp)
                    Spacer(Modifier.height(12.dp))
                    Text("WET VPN", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "Приложение находится в разработке",
                        color = Muted,
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(Modifier.height(24.dp))

            Button(
                onClick = { },
                enabled = false,
                modifier = Modifier.fillMaxWidth().height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    disabledContainerColor = Yellow.copy(alpha = 0.35f),
                    disabledContentColor = Black
                )
            ) {
                Text("ПОДКЛЮЧИТЬСЯ", fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(18.dp))
            Text(
                "Подключение VPN пока не активировано. Сначала нужно подключить совместимый VPN-движок и формат подписки сервиса.",
                color = Muted,
                fontSize = 12.sp,
                lineHeight = 18.sp
            )

            Spacer(Modifier.weight(1f))
            Text("WET VPN  •  ANDROID", color = Muted, fontSize = 11.sp)
        }
    }
}
