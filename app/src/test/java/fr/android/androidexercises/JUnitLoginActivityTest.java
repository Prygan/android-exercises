package fr.android.androidexercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JUnitLoginActivityTest {
    @Mock LoginActivity activity;

    @InjectMocks LoginPresenter presenter;

    @Test
    public void password_should_be_valid() throws Exception {
        //Given
        //When
        presenter.checkCredentials("password");
        //Then
        Mockito.verify(activity).logged();
        Mockito.verify(activity).message(R.string.text_logged);
    }

    @Test
    public void password_should_be_not_valid() throws Exception {
        //Given
        //When
        presenter.checkCredentials("p");
        //Then
        Mockito.verify(activity).notLogged();
        Mockito.verify(activity).message(R.string.notLogged);
    }
}