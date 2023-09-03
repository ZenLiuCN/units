package cn.zenliu.plugins.units;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementFactory;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiShortNamesCache;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/**
 * @author Zen.Liu
 * @since 2023-05-09
 */
public interface PSI {
    Project p();

    default @NotNull Collection<VirtualFile> filesByName(String name) {
        return FilenameIndex.getVirtualFilesByName(name, GlobalSearchScope.everythingScope(p()));
    }

    default @NotNull PsiClass @NotNull [] classByName(String name) {
        return PsiShortNamesCache.getInstance(p()).getClassesByName(name, GlobalSearchScope.everythingScope(p()));
    }

    default @NotNull PsiMethod constructorFrom(String text) {
        return PsiElementFactory.getInstance(p()).createConstructor(text);
    }

    default @NotNull PsiMethod methodFrom(String text, PsiElement element) {
        return PsiElementFactory.getInstance(p()).createMethodFromText(text, element);
    }
    default int findType(){
        return PsiShortNamesCache.getInstance(p()).get
    }
}
