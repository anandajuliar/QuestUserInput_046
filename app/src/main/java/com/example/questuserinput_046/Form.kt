package com.example.questuserinput_046

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun RegistrationForm(modifier: Modifier = Modifier) {
    var textNamaLengkap by remember { mutableStateOf(value = "") }
    var textKotaAsal by remember { mutableStateOf(value = "") }
    var textTanggalLahir by remember { mutableStateOf(value = "") }
    var textRT by remember { mutableStateOf(value = "") }
    var textRW by remember { mutableStateOf(value = "") }
    var textUmur by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    var nama by remember { mutableStateOf(value = "") }
    var asal by remember { mutableStateOf(value = "") }
    var tanggal by remember { mutableStateOf(value = "") }
    var rt by remember { mutableStateOf(value = "") }
    var rw by remember { mutableStateOf(value = "") }
    var umur by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    var setuju by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp, vertical = 50.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.9f)
                ),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Form Registrasi",
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    OutlinedTextField(
                        value = textNamaLengkap,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "Nama Lengkap") },
                        onValueChange = {
                            textNamaLengkap = it
                        }
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        value = textKotaAsal,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "Kota Asal") },
                        onValueChange = {
                            textKotaAsal = it
                        }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = textTanggalLahir,
                            singleLine = true,
                            shape = MaterialTheme.shapes.large,
                            modifier = Modifier.weight(2f),
                            label = { Text(text = "Tanggal Lahir") },
                            onValueChange = {
                                textTanggalLahir = it
                            }
                        )
                        OutlinedTextField(
                            value = textRT,
                            singleLine = true,
                            shape = MaterialTheme.shapes.large,
                            modifier = Modifier.weight(1f),
                            label = { Text(text = "RT") },
                            onValueChange = {
                                textRT = it
                            }
                        )
                        OutlinedTextField(
                            value = textRW,
                            singleLine = true,
                            shape = MaterialTheme.shapes.large,
                            modifier = Modifier.weight(1f),
                            label = { Text(text = "RW") },
                            onValueChange = {
                                textRW = it
                            }
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        value = textUmur,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text(text = "Umur") },
                        onValueChange = {
                            textUmur = it
                        }
                    )
                    Spacer(modifier = Modifier.height(17.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "Jenis Kelamin",
                                style = MaterialTheme.typography.bodyLarge,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            gender.forEach { item ->
                                Row(
                                    modifier = Modifier.selectable(
                                        selected = textJK == item,
                                        onClick = { textJK = item }
                                    ), verticalAlignment = Alignment.CenterVertically) {
                                    RadioButton(
                                        selected = textJK == item,
                                        onClick = {
                                            textJK = item
                                        })
                                    Text(text = item, style = MaterialTheme.typography.bodySmall)
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(1f)
                                        .padding(top = 4.dp)
                                        .selectable(
                                            selected = setuju,
                                            onClick = { setuju = !setuju }
                                        ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Checkbox(
                                        checked = setuju,
                                        onCheckedChange = { setuju = it }
                                    )
                                    Text(
                                        text = "Saya setuju dengan syarat dan ketentuan yang berlaku",
                                        style = MaterialTheme.typography.bodySmall,
                                        modifier = Modifier.padding(start = 4.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.height(20.dp))
                                Button(
                                    modifier = Modifier.fillMaxWidth(fraction = 1f),
                                    onClick = {
                                        nama = textNamaLengkap
                                        jenis = textJK
                                        asal = textKotaAsal
                                    }
                                ) {
                                    Text(text = stringResource(id = R.string.submit))
                                }
                                Spacer(modifier = Modifier.height(25.dp))
                                ElevatedCard(
                                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                                    colors = CardDefaults.cardColors(containerColor = Color.Black),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(height = 160.dp)

                                ) {
                                    Column(
                                        modifier = Modifier.padding(
                                            horizontal = 15.dp,
                                            vertical = 15.dp
                                        ),
                                        verticalArrangement = Arrangement.spacedBy(4.dp) // Beri jarak
                                    ) {
                                        Text(text = "NamaLengkap : " + nama, color = Color.White)
                                        Text(text = "KotaAsal : " + asal, color = Color.White)
                                        Text(
                                            text = "Tanggal Lahir : " + tanggal,
                                            color = Color.White
                                        )
                                        Text(text = "RT/RW : " + rt + "/" + rw, color = Color.White)
                                        Text(text = "Umur : " + umur, color = Color.White)
                                        Text(text = "Gender : " + jenis, color = Color.White)
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
