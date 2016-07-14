package com.softdesign.devintensive.ui.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";



    /**
     * метод вызывается при создании активити после изменения конфигурации/возврвта к текущей
     * активности после его уничтожения.
     *
     * в данном методе инициализируются/производится:     *
     * - UI пользовательский интерфейс (статика)
     * - инициализация статических данных активити
     * - связь данных со списками (инициализация адаптеров)
     *
     * не запускать длительные операции по работе с данными в onCreate() !!!
     *
     * @param savedInstanceState - объект со сначениями сохраненными в Bundle - состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d (TAG, "onCreate");

        if (savedInstanceState == null) {
            // активити запускается впервые
        } else {
            // активити уже создавалось
            }
    }

    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступен ползователю
     * как правило в данном методе происходит регистрация подписки на собвтия, остановка которых была
     * произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d (TAG, "onStart");
    }

    /**
     * метод вызывается когда активити становится доступна пользователю для взаимодействия
     * в данном методе как правило происходит запуск анимаций/аудио/видео/запуск BroadcastReceiver
     * необходимых доя реализации UI логики/запуск выполнения потоков и т.п.
     * метод должен быть максимально легковесным для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d (TAG, "onResume");
    }

    /**
     * метод вызывается когда текущая активити теряет фокус но остается видимой (всплытие
     * диалогового окна/частичное перекрытие другой активити/ и т.д.
     * <p/>
     * в данном методе реализуют сохранение легковесных UI данных/анимаций/аудио/видео и т.д.)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d (TAG, "onPause");
    }

    /**
     * метод вызывается когда активити становится невидимым для пользователя.
     * в данном методе происходит отписка от событий, остановка сложных операций, сложные операции по
     * сохранению данных/прерыванию запущенных потоков/и.т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d (TAG, "onStop");
    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или после вызов
     * метода finish())
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d (TAG, "onDestroy");
    }

    /**
     * метод вызывается при рестарте активити/возобновлении работы после вызова метода onStop()
     * в данном методе реализуется специфическая бизнес логика кототрая должна быть реализована именно
     * при рестарте активности - например запросы к серверу которые необходимо вызывать при возвращении
     * из другой активности (обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/специфическая бизнес логика завязанная на перезапуске активности)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d (TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

           }
}

