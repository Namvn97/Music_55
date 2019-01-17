package framgia.phannam.android.nmusic.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.fristproject.android.music55.R;

import framgia.phannam.android.nmusic.ui.home.HomeCategoriesAdapter;

public class MainActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    private RecyclerView mRecyclerView;
    private HomeCategoriesAdapter mCategoriesAdapter;
    public static final int SPAN_COUNT = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.ic_menu);
        getSupportActionBar().setTitle("Music");

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        mRecyclerView = findViewById(R.id.recyler_home);
        mRecyclerView.setAdapter(mCategoriesAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), SPAN_COUNT);
        mRecyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                return true;
            case R.id.navigation_favorite:
                return true;
            case R.id.navigation_my_music:
                return true;
            default:
                break;
        }
        return false;    }
}
