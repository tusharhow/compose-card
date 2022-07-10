import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun DetailsScreen(navController: NavController){

    Scaffold(

content = {
    BodyContent()
}
    )
}

@Composable
fun  BodyContent(){
   Column(Modifier.padding(10.dp)) {
   Box(
       Modifier
           .fillMaxWidth()
           .height(300.dp)
           .clip(shape = RoundedCornerShape(10.dp))
           .background(color = androidx.compose.ui.graphics.Color.Cyan),
       Alignment.Center,) {
       
   }
   }
}