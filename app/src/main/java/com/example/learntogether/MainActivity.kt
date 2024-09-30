package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnTogether(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogether(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        LearnTogetherImage(modifier = Modifier.fillMaxWidth()) // L'image occupera toute la largeur
        LearnTogetherFirstParagh()
        LearnTogetherSecondParagh()
        LearnTogetherThirdParagh()
    }
}

@Composable
fun LearnTogetherFirstParagh() {
    Text(
        text = "Jetpack Compose tutorial",
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun LearnTogetherSecondParagh() {
    Text(
        text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerates UI development on Android with less code, " +
                "powerful tools, and intuitive Kotlin APIs.",
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp, 0.dp)
    )
}

@Composable
fun LearnTogetherThirdParagh() {
    Text(
        text = "In this tutorial, you build a simple UI component with declarative functions. " +
                "You call Compose functions to say what elements you want and the Compose " +
                "compiler does the rest. Compose is built around Composable functions. These functions " +
                "let you define your app's UI programmatically because they let you describe how it " +
                "should look in provide data dependencies, rather than focus on the process of the UI's " +
                "construction, such as initializing an element and then attaching it to a parent. To " +
                "create a Composable function, you add @Composable annotation to the function name.",
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun LearnTogetherImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.FillWidth // Conserver le ratio de l'image
    )
}

@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    LearnTogetherTheme {
        LearnTogether()
    }
}
