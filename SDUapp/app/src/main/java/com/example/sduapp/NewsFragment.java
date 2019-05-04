package com.example.sduapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class NewsFragment extends Fragment {
    private View v;
    private RecyclerView myrecyclerView;
    static List<News> listNews;

    public NewsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listNews =new ArrayList<>();
        listNews.add(new News("Guests from University of Tasmania, Australia","During October-November 2018, we had the most honourable guests Dr.Rosemary Callingham and Dr.Ian Hay from University of Tasmania, Australia.\n" +
                "\n" +
                "They visited our university for 4 weeks.\n" +
                "\n" +
                "She taught various courses and provided training to SDU community including graduate students, instructors, researchers. Some of the topics she covered include Writing a proposal, Tips to write a thesis, Research methods, Rasch analysis, and Statistical Literacy. There was very high positive feedback from all of the attendees. They all learned great deal from her lectures and trainings and confirmed that their motivation to do a research increased significantly. Prof Callingham already started 3 new research projects with our Research faculty and PhD students related to attitudes towards mathematics education, problem based learning, and assessment methods in Higher Education Universities in Kazakhstan.\n" +
                "\n" +
                "This is SDU’s first experience receiving professors on the Ministry’s funding program. SDU is grateful for the Ministry of Education and Science for such an opportunity.  ",R.drawable.tasmania));
        listNews.add(new News("MIT courses","Hey, knowledge lovers we have great news for you!\n" +
                "If you are ambitious and intelligent representative of our future leaders, you have to take a moment for reading this. Thorough this link, you can find an amazing courses offered by MIT, one of the best universities in the world. You mustn’t lose this opportunity, because it is one and only chance to get more improvement in your education and vision.\n" +
                "So, don’t waste your time, and follow the link ASAP!",R.drawable.mit));
        listNews.add(new News("Елбасы жолдауы басты назарда","Білім ордасы бәсекеге қабілетті, нарық талабына сай замануи маман иелерін жоғары сұранысқа ие 21 мамандық бойынша әзірлейді. Соңғы екі жылда Білім беру сапасын қамтамасыздандыру тәуелсіз Қазақстан агенттігінің рейтингі бойынша «Ақпараттық жүйелер» мен «Математикалық ғылымдар»  мамандықтары бірінші орында тұр, - деп баяндады СДУ президенті.",R.drawable.elbasy));
        listNews.add(new News("Winners of INFOMATRIX-ASIA 2018 have been announced","So, winners are: robotics - Aldiyar Қabdullov (Kazakhstan), computer programming - Rustem Khasanov (Kazakhstan), computer graphics and art - Lym Hin Jing (Hong Kong ), Baurzhan Orynbaev (Kazakhstan) won the grant in the dronovs race, Gaukhar Turganbekova (Kazakhstan) - control system (hardware), Batyrbek Kayipbay (Kazakhstan) - short films, and Asmir Abdimajit (Kazakhstan) - mathematical projects. Among the remaining participants, the second and third places went to contestants from Hong Kong and Ukraine, who were awarded 50% and 30% grants.",R.drawable.informatrix));
        listNews.add(new News("Winter Mathematical Games 2018","Within the framework of cooperation with \"Tamos Education\"  private school and SDU, faculty staff of the \"Science Education Department\" participate \"Winter Mathematical Games 2018\" tournament as referees which was held on February 9-10, 2018. High level of professionalism of our teachers was highlighted by certificates.\n" +
                "\n" +
                "Certificates were solemnly presented to the following teachers at the faculty council: MSc Aidarkyzy Balym, MSc Orynbassar Alibek, as well as assistants: Salibek Dina and Yelemes Tolkynay.",R.drawable.math));
        listNews.add(new News("Rector of SDU wishes you a Happy New Year!","Подводя итоги, можно выделить основные моменты:\n" +
                "\n" +
                "1. Начата разработка проекта «Цифровой Университет», цель которого автоматизация всех бизнес-процессов, упрощение работы факультетов и повышение оперативности, скорости услуг в СДУ. Будем использовать ИИ.\n" +
                "\n" +
                "2. Начата работа по разработке программ Major/Minor. Как мы знаем, сейчас очень актуальны междисциплинарные навыки: таким образом студент по специальности ИТ может получить предметы, связанные с менеджментом. Также, студент специальности экономика, может получить навыки ИТ программирования и анализа данных. Это касается всех факультетов.\n" +
                "\n" +
                "3. Начата работа по обучению топ-менеджмента методологии Agile/SCRUM. Нам необходимо эффективно работать и наши управленцы должны хорошо знать проектное управление.\n" +
                "\n" +
                "4. Был обновлен «ТехноПарк СДУ». Теперь студенты ИТ специальностей будут иметь возможность работать и стажироваться не выходя из СДУ. Несколько компаний уже открыли свои филиалы в ТехноПарке.\n" +
                "\n" +
                "5. Идет работа над интеграцией образовательных программ в Болонский процесс, определены ЕCTS кредиты.\n" +
                "\n" +
                "6. Каждый факультет теперь имеет свой Advisory Board, который будет работать над актуализацией образовательных программ, будут проводиться встречи с выпускниками.\n" +
                "\n" +
                "7. Есть еще много внутренних процессов, таких как СМК, подготовка к международным аккредитациям, и другие внутренние работы.\n" +
                "\n" +
                "8. В этом году поступило рекордное количество студентов, мы получили гранты на программы магистратуры и докторантуры.\n" +
                "\n" +
                "9. Открыли центр непрерывного образования, будем вплотную работать с Карасайским районом.\n" +
                "\n" +
                "10. Начали сотрудничество с MIT, университетом Leicester University, и др.\n" +
                "\n" +
                "В целом хотелось бы отметить, что в СДУ самое главное - это очень профессиональная и дружная команда. Очень рад, что являюсь частью этой команды. У нас самые талантливые студенты, я искренне желаю им найти себя в жизни и работать во благо Казахстана.\n" +
                "\n" +
                "Желаю нашим студентам получить самые актуальные знания, нашим преподавателям побольше вдохновения. Вы самые лучшие! Я надеюсь, что в новом 2018 году мы достигнем новых высот!!!\n" +
                "\n" +
                " \n" +
                "\n" +
                "С уважением ректор СДУ Канат Кожахмет",R.drawable.rector));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_news,container,false);
        myrecyclerView = v.findViewById(R.id.news_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listNews);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapter);
        return v; }


}
