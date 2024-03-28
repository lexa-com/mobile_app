package test.example.betgurus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.betgurus.R;

import java.util.ArrayList;

public class CourseRVAdapter extends RecyclerView.Adapter<CourseRVAdapter.ViewHolder> {
    // creating variables for our ArrayList and context
    private ArrayList<Courses> coursesArrayList;
    private Context context;

    // creating constructor for our adapter class
    public CourseRVAdapter(ArrayList<Courses> coursesArrayList, Context context) {
        this.coursesArrayList = coursesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // passing our layout file for displaying our card item
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.course_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseRVAdapter.ViewHolder holder, int position) {
        // setting data to our text views from our modal class.
        Courses courses = coursesArrayList.get(position);
        holder.date.setText(courses.getDate());
        holder.league.setText(courses.getLeague());
        holder.game.setText(courses.getGames());
        holder.ko.setText(courses.getKo());
        holder.predict.setText(courses.getPredict());
        holder.results.setText(courses.getResult());
        holder.verdict.setText(courses.getVerdict());
        holder.odds.setText(courses.getOdds());
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list.
        return coursesArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // creating variables for our text views.
        private final TextView date,league,game,ko,predict,results,verdict,odds;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views.

            date= itemView.findViewById(R.id.iddate);
            league = itemView.findViewById(R.id.idleague);
            game = itemView.findViewById(R.id.idgame);
            ko = itemView.findViewById(R.id.idko);
            predict = itemView.findViewById(R.id.idpredict);
            results = itemView.findViewById(R.id.idresults);
            verdict = itemView.findViewById(R.id.idverdict);
            odds = itemView.findViewById(R.id.idodd);

        }
    }
}
