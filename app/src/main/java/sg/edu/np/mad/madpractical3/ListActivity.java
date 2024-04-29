package sg.edu.np.mad.madpractical3;

import android.os.Bundle;
import android.content.DialogInterface;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Creating AlertDialog.Builder inside onCreate method
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness");
        builder.setCancelable(true);

        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // Create an Intent to open the activity that displays activity_main.xml
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // Action when "No" button is clicked
                // Perform action here
            }
        });

        // Create the AlertDialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
